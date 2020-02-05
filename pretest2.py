wordlove = input('Enter word: ')
sentence = input('Enter sentence: ').split()
count = 0 
for i in sentence:
    if i == wordlove:
       count += 1
print(count)       