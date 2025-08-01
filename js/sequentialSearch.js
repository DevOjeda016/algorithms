const element = 5;
const arr = [1, 3, 4, 6, 3];
const sequentialSearch = (element, arr) => {
  for (let i = 0; i < arr.length; i++) {
    if (element === arr[i]) {
      return i;
    }
  }
  return -1;
}

try {
  const index = sequentialSearch(element, arr);
  const out = index != -1
    ? `Element ${element} was found in the index ${index}`
    : 'Element was not found';
  console.log(out);
} catch (error) {
  console.log(error.message);
}
