def find_substring(string, substring):
  n = len(string)
  m = len(substring)
  occurences = []

  for i in range(n - m + 1):
    j = 0
    while j < m:
      if string[i + j] != substring[j]:
        break
      j += 1
    if j == m:
      occurences.append(i)
  return occurences

string = "Hello Dev!"
substring = "Dev"

results = find_substring(string, substring)

print(f"Occurences found in {results}")



