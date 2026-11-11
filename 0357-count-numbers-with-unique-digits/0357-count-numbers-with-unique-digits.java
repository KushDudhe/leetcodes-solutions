class Solution {
    public int countNumbersWithUniqueDigits(int n) {
      if(n==0) {
        return 1;
      }
      int count = 10;
      int unquie = 9;
      int ava = 9;
      for(int i=2;i<=n && i<=10;i++) {
        unquie = unquie*ava;
        count+=unquie;
        ava--;
      }
      return count;
    }
}