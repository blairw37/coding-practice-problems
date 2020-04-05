class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        
        sum = 1*(getCount(s)[0]) + 5*(getCount(s)[1]) + 10*(getCount(s)[2]) + 50*(getCount(s)[3]) + 100*(getCount(s)[4]) + 500*(getCount(s)[5]) + 1000*(getCount(s)[6]);
        
        if (iBeforeVorX(s) == true) {
            sum = sum - 2;
        }
        if (xBeforeLorC(s) == true) {
            sum = sum - 20;
        }
        if (cBeforeDorM(s) == true) {
            sum = sum - 200;
        }
        
        System.out.println(sum);
        
        return sum;
    }
    
    public boolean iBeforeVorX(String s) {
        boolean iBeforeVorX = false;
        for(int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                iBeforeVorX = true;
            }
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                iBeforeVorX = true;
            }
        }
        return iBeforeVorX;
    }
    
    public boolean xBeforeLorC(String s) {
        boolean xBeforeLorC = false;
        for(int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') || (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C')) {
                xBeforeLorC = true;
            }
        }
        
        return xBeforeLorC;
    }
    
    public boolean cBeforeDorM(String s) {
        boolean cBeforeDorM = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') || (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M')) {
                cBeforeDorM = true;
            }
        }
        
        return cBeforeDorM;
    }
    
    public int[] getCount(String s) {
        int Icount = 0;
        int Vcount = 0;
        int Xcount = 0;
        int Lcount = 0;
        int Ccount = 0;
        int Dcount = 0;
        int Mcount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I':
                    Icount++;
                    break;
                case 'V':
                    Vcount++;
                    break;
                case 'X':
                    Xcount++;
                    break;
                case 'L':
                    Lcount++;
                    break;
                case 'C':
                    Ccount++;
                    break;
                case 'D':
                    Dcount++;
                    break;
                case 'M':
                    Mcount++;
                    break;
                default:
                    break;
            }
        }
        
        int[] results = new int[7];
        
        results[0] = Icount;
        results[1] = Vcount;
        results[2] = Xcount;
        results[3] = Lcount;
        results[4] = Ccount;
        results[5] = Dcount;
        results[6] = Mcount;
        
        return results;
    }
}

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
            case 'M':
                sum += 1000;
                break;
            case 'D':
                sum += 500;
                break;
            case 'C':
                sum += 100;
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                        sum -= 200;
                    }
                }
                break;
            case 'L':
                sum += 50;
                break;
            case 'X':
                sum += 10;
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                        sum -= 20;
                    }
                }
                break;
            case 'V':
                sum += 5;
                break;
            case 'I':
                sum += 1;
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                        sum -= 2;
                    }
                }
                break;
            }
        }

        return sum;
    }
}