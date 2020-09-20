def removedupli(string):
  n = len(string)
  res = ""
  for i in range(n):
    if i==0:
      res += string[0]
    for j in range(len(res)):
      temp = string[i]
      if string[i]==res[j]:
        temp = ''
        break
    if temp != '':
      res += temp
  return res
  
string = input()
print(removedupli(string))