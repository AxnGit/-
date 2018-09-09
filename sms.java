 public static void main(String[] args) throws ClientException {
        //随机生成六位随机数
        StringBuffer stringBuffer=new StringBuffer();
        for (int x=0;x<=5;x++) {
            int random = (int) (Math.random() * (10 - 1));
            stringBuffer.append(random);
        }
        String string = stringBuffer.toString();
        int i = Integer.parseInt(string);
         System.out.println(i);
