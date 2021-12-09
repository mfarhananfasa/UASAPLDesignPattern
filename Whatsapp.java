class Whatsapp extends ContactDecorator {
    public Whatsapp(Contact c) {
      super(c);
    }
    
    @Override
    public void assemble() {
      super.assemble();
      System.out.println("whatsapp ");
    }
  }