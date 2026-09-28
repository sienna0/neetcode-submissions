"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

class Solution:
    visited = {}
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if node is None:
            return None

        new_neighbors = []
        self.visited[node] = Node(node.val)
        for neighbor in node.neighbors:
            if neighbor not in self.visited:
                new_neighbor = self.cloneGraph(neighbor)
                self.visited[neighbor] = new_neighbor
                new_neighbors.append(new_neighbor)
            else:
                new_neighbors.append(self.visited[neighbor])


        curr_node = self.visited[node]
        curr_node.neighbors = new_neighbors
        return curr_node