dic = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
      'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
      '0','1','2','3','4','5','6','7','8','9','+','/' ]

T = int(input())
for test_case in range(1, T + 1):
    word = list(input())
    value = '' 
    
    for j in range(len(word)):
        num = dic.index(word[j])
        bin_num = str(bin(num)[2:])
        while len(bin_num) < 6:
            bin_num = '0' + bin_num
        value += bin_num
            
    result = ''
    
    for k in range(len(word)*6 // 8):
        number = int(value[k*8 : k*8+8], 2)
        result += chr(number)
    print('#%d %s' % (test_case, result))