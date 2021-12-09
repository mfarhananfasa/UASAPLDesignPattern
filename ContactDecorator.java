class ContactDecorator implements Contact {
    protected Contact contact;
    
    public ContactDecorator(Contact c) {
      this.contact = c;
    }
  
    @Override
    public void assemble() {
      this.contact.assemble();
    }
}