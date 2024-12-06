public class Fighter extends Adventurer{
  private int resolve, wrath;
  public Fighter (String name){
    super(name);
    resolve = 10;
    wrath = 0;
  }
  public Fighter (String name, int resolve, int wrath){
    super(name);
    if (resolve < 20 && resolve > 0){
      this.resolve = resolve;
    }
    else{
      throw new IllegalArgumentException("Resolve cannot be negative or greater than 20.");
    }
    if (wrath > 0 && wrath <= 100){
      this.wrath = wrath;
    }
    else{
      throw new IllegalArgumentException("Wrath cannot be negative or greater than 100.");
    }
  }
  public String getSpecialName(){
    return this.getName() + "'s power is wrath";
  }
  public int getSpecial(){
    return this.wrath;
  }
  public void setSpecial(int n){
    if (n > 0 && n < 100){
      this.wrath = n;
    }
  }
  public int getSpecialMax(){
    return 100;
  }
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.setHP(other.getHP() - 3);
    return getName() + " hit " + other.getName() + "with their axe!";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    int newHP = other.getHP() + (int)(resolve / 2);
    if (newHP > other.getmaxHP()){
      other.setHP(other.getmaxHP());
      return getName() + " inspired " + other.getName() + " with his immense resolve!";
    }
    other.setHP(newHP);
    return getName() + " inspired " + other.getName() + ".";
  }

  //heall or buff self
  public String support(){

  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){

  }
}
