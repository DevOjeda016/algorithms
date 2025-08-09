def binary_search(arr, target):
  low = 0
  high = len(arr) - 1

  while low <= high:
    mid = low + (high - low) // 2
    if arr[mid] == target:
      return mid
    elif arr[mid] < target:
      low = mid + 1
    else:
      high = mid - 1
  return -1

arr = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
target = 23
result = binary_search(arr, target)
if result != -1:
  print(f"Element {target} is at index {result}")
else:
  print(f"Element {target} is not in the list")