package lista;

public class Lista{
  private Elemento inicio=null,atual,aux;
  
  //método de instância
  public void inserir(Object objeto){
    if(inicio==null){
      inicio=new Elemento(objeto,null);
      aux=inicio;
    }else{
       atual=new Elemento(objeto,null);
       aux.setProx(atual);
       aux=atual;
    }
  }
  
  public void exibir(){
    Elemento x=inicio;
    while(x!=null){
        System.out.println(x.getObjeto());
        x=x.getProx();
    }
  }
  
  public Carro pesquisarId(int id){
    Elemento x=inicio;
    Carro c;
    while(x!=null){
      c=(Carro)x.getObjeto();
      if(id==c.getId()){
        return c;
      }
      x=x.getProx();
    }
    return null;
  }
  
  private Elemento[] pesquisarRemove(int id){
      Elemento rem=inicio, auxRem=null;
      Elemento[] v={rem,auxRem};
      Carro c;
      while(rem!=null){
        c=(Carro)rem.getObjeto();
        if(id==c.getId()){
          v[0]=rem;
          v[1]=auxRem;
          return v;
        }   
        auxRem=rem;
        rem=rem.getProx();
      }
    return null;  
  }
  
  public boolean remover(int id){
     Elemento[] v=pesquisarRemove(id);
     if(v!=null){
        Elemento rem=v[0];
        Elemento auxRem=v[1];
        if(rem==inicio){//Remove o primeiro elemento
          inicio=rem.getProx();
          rem.setProx(null);
        }else if(rem==atual){//Remove o último elemento
            aux=auxRem;
            atual=auxRem;
            auxRem.setProx(null);
        }else{//Remove um elemento qualquer
          auxRem.setProx(rem.getProx());
          rem.setProx(null);
        }
       return true;
     }
     return false;
  }

 //Classe interna
private class Elemento {

    private Object objeto;//Dados
    private Elemento prox;

    public Elemento(Object objeto, Elemento prox) {
        this.objeto = objeto;
        this.prox = prox;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "Elemento{" + "objeto=" + objeto + ", prox=" + prox + '}';
    }

}


}

