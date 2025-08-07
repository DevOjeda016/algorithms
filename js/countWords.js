const tokenize_words = text => text.split(" ");

const countWords = tokens => {
  const countedWords = new Map();
  tokens.forEach(token => countedWords.set(token, countedWords.get(token) + 1 || 1));
  return countedWords;
}

const displayTable = countedWords => {
  console.log(`${'Word'.padEnd(20)}${'Frequency'.padStart(20)}`)
  countedWords.forEach((k, v) => console.log(`${v.padEnd(20)}${String(k).padStart(20)}`))
}

const text = "Hello Devs, Today I going to talk about my experience as a programmer. I started as a dev 5 year ago"
const tokens = tokenize_words(text);
const countedWords = countWords(tokens);
displayTable(countedWords)