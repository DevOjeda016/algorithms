def sequential_search(element, list):
  for i in range(len(list)):
    if list[i] == element:
      return i
  return -1

element = 2
list = [1, 2, 5, 4, 6]

try:
  index = sequential_search(element, list)
  out = (
    f"Element {element} was found in the index {index}"
    if index != -1 else
    "Element was not found"
  )
  print(out)
except Exception as e:
  print(f"Error: {e}")