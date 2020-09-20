def wildcardMatching(string, pattern):
  countf=0
  countb=0
  n1 = len(string)
  n2 = len(pattern)
  
  for element in pattern:
    if(element >= 'a' and element <= 'z'):
      countf += 1
    elif(element >= 'A' and element <= 'Z'):
      countf += 1
    else:
      break
    
  for element in pattern[::-1]:
    if(element >= 'a' and element <= 'z'):
      countb += 1
    elif(element >= 'A' and element <= 'Z'):
      countb += 1
    else:
      break
  
  if(countf!=0):
    for i in range(countf):
      if(pattern[i]!=string[i]):
        print('false')
        exit()
  
  for i in range(countb):
    if(pattern[n2-i-1]!=string[n1-i-1]):
      print('false')
      exit()
  
  print('true')


string = input()
pattern = input()
  
wildcardMatching(string, pattern)