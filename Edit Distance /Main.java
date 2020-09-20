def distance(str1, str2, len1, len2, table):
  if not str1:
    return len2
  elif not str2:
    return len1
  else:
    for i in range(1, len2+1):
      for j in range(1, len1+1):
        if str1[j-1] == str2[i-1]:
          table[i][j] = table[i-1][j-1]
        else:
          table[i][j] = 1 + min(table[i-1][j], table[i][j-1], table[i-1][j-1])
    return table[len2][len1]
    
def str_change(str1, str2):
  len1 = len(str1)
  len2 = len(str2)
  table = [[0 for j in range(len1+1)] for i in range(len2+1)]
  for i in range(len1+1):
    table[0][i] = i
  for i in range(len2+1):
    table[i][0] = i
  count = distance(str1, str2, len1, len2, table)
  return count

str1 = input()
str2 = input()
print(str_change(str1, str2))