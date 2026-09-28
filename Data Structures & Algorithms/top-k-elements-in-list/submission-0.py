class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = {}
        for num in nums:
            freq_map[num] = freq_map.get(num, 0) + 1
        
        freq_arr = list(freq_map.items())
        freq_arr.sort(key = lambda x: x[1], reverse = True)
        freq_nums = [item[0] for item in freq_arr]
        return freq_nums[0:k]

