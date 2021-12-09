class Telegram extends ContactDecorator {
    public Telegram(Contact c) {
      super(c);
    }
    
    @Override
    public void assemble() {
      super.assemble();
      System.out.println("telegram ");
    }
  }