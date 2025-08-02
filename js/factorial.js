const factorial = n => {
  let result = 1;
  for (let i = 1; i <= n; i++) {
    result *= i;
  }
  return result
}

const n = 5;
result = factorial(n);
console.log(`Factorial of ${n} is ${result}`)

