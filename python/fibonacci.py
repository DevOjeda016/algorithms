def get_Fibonacci(n):
  if n <= 0:
    return []
  
  if n == 1:
    return [0]
  
  sequence = [0, 1] # Initial values of Fibonacci sequence

  for i in range(2, n):
    sequence.append(sequence[i - 1] + sequence[i - 2])
  return sequence

sequence = get_Fibonacci(20)
print(sequence)


    



