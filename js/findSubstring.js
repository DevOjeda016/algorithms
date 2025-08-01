const findSubstring = (string, substring) => {
  const n = string.length;
  const m = substring.length;
  let occurences = []

  for (let i = 0; i <= (n - m); i++) {
    j = 0;
    while (j < m) {
      if (string[i + j] !== substring[j]) {
        break;
      }
      j += 1;
    }
    if (j === m) {
      occurences.push(i)
    }
  }
  return occurences;
}

const string = "Dev, Hello Dev!";
const substring = "Dev";

const results = findSubstring(string, substring);

console.log(`Occurences found in ${results}`)