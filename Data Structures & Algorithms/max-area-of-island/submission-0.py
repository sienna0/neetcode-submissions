class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        stack = []
        directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
        max_area = 0
        rows, cols = len(grid), len(grid[0])

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1:
                    grid[r][c] = -1
                    stack.append((r, c))
                    area = 0

                    while stack:
                        rr, cc = stack.pop()
                        area += 1
                        for dr, dc in directions:
                            nr, nc = rr + dr, cc + dc
                            if 0 <= nr < rows and 0 <= nc < cols and grid[nr][nc] == 1:
                                grid[nr][nc] = -1
                                stack.append((nr, nc))

                    max_area = max(max_area, area)

        return max_area