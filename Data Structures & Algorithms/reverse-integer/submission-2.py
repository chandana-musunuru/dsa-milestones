class Solution:
    def reverse(self, x: int) -> int:
        string=str(x)
        parts=[]
        if string[0]=='-':
            parts.append("-")
            parts.append(string[1:][::-1])
        else:
            parts.append(string[::-1])
        y=int(''.join(parts))
        if y < -2**31 or y > 2**31 - 1:
            return 0

        return y

        
            

        