class Line extends ContactDecorator {
    public Line(Contact c) {
      super(c);
    }
    
    @Override
    public void assemble() {
      super.assemble();
      System.out.println("Line ");
    }
  }