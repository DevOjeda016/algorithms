def factorial(n):
  result = 1
  for i in range(1, n + 1):
    result *= i
  return result

n = int(input("Enter a number: "))
result = factorial(5)

print(f"Factorial of {n} is {result}")