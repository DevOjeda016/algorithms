const getFibonacci = n => {
  if (n <= 0) return [];

  if(n == 1) return [0];

  sequence = [0, 1];

  for (let i = 2; i < n; i++) {
    sequence.push(sequence[i - 1] + sequence[i -2]); 
  }
  return sequence
}

sequence = getFibonacci(20);
console.log(sequence);