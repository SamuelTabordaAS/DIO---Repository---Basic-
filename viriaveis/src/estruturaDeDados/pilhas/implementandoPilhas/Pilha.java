package estruturaDeDados.pilhas.implementandoPilhas;

public class Pilha {

    private No refNoEntradaPilha ; 

    public Pilha() { 
        this.refNoEntradaPilha = null ; 
    }

    public void push(No novoNo){
        No refAuxilar = refNoEntradaPilha ; 
        refNoEntradaPilha = novoNo ; 
        refNoEntradaPilha.setRefNo(refAuxilar);
    }

    public No pop(){ 
        if(!this.isEmpyt()){
            No noPoped = refNoEntradaPilha ; 
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); 
            return noPoped ; 
        }
        return null ; 
    }

    public No top(){ 
        return refNoEntradaPilha ; 
    }

    public boolean isEmpyt(){ 

        return refNoEntradaPilha == null ? true : false ; 

    }
    











}
