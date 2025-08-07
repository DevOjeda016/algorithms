def tokenize_text(text):
  tokens = text.split()
  return tokens

def count_words(tokens):
  word_count = {}
  for token in tokens:
    if token.lower() in word_count:
      word_count[token.lower()] += 1
    else:
      word_count[token.lower()] = 1
  return word_count

def display_word_count(word_count):
  print(f"{'word':<20}{'Frequency':>10}")
  print("=" * 30)
  for word, count in word_count.items():
    print(f"{word:<20}{count:>10}")

text = "Hello Devs, Today I going to talk about my experience as a programmer. I started as a dev 5 year ago"
tokens = tokenize_text(text)
word_count = count_words(tokens)
display_word_count(word_count)
