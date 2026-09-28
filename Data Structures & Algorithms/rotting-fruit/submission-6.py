class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        row, col = len(grid), len(grid[0])
        queue = deque()
        directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
        time = 0
        fruit_found = 0

        for r in range(row):
            for c in range(col):
                if grid[r][c] == 1:
                    fruit_found += 1

                if grid[r][c] == 2:
                    # rotton fruit
                    grid[r][c] = -1
                    queue.append((r, c, 0))
                
        while queue:
            curr_row, curr_col, curr_time = queue.popleft()
            time = max(time, curr_time)
            for d, (dir_r, dir_c) in enumerate(directions):
                new_row, new_col = curr_row + dir_r, curr_col + dir_c
                if 0 <= new_row < row and 0 <= new_col < col and grid[new_row][new_col] == 1:
                    fruit_found -= 1
                    grid[new_row][new_col] = -1
                    queue.append((new_row, new_col, curr_time + 1))
                
        return time if fruit_found == 0 else -1