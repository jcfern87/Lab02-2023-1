package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {}

    @Override
    public boolean buscaElemento(int valor) {
        if(this.array != null){
            for(int i : this.array){
                if(i == valor){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int buscaIndice(int valor) {
        return this.array[valor];
    }

    @Override
    public int minimo() {
        int min = this.array[0];
        for(int i : this.array){
            if(i < min){
                min = i;
            }
        }
        return min; 
    }

    @Override
    public int maximo() {
        int max = this.array[0];
        for(int i : this.array){
            if(i > max){
                max = i;
            }
        }
        return max; 
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
         if(this.array != null){
            int[] obj = new int[this.array.length + 1];
            for(int i = 0; i < this.array.length - 1; i++){
                obj[i] = this.array[i];
            }
            obj[indice_fim + 1] = valor;
            this.array = obj;
            this.indice_fim = this.array.length - 1;
        }
        else{
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if(this.array != null){
            int[] obj = new int[this.array.length + 1];
            for(int i = 0; i < this.array.length; i++){
                if(i < buscaIndice){
                    obj[i] = this.array[i];
                }
                else if(i == buscaIndice){
                    obj[i] = valor;
                    if(i < indice_fim){
                        obj[i + 1] = this.array[i];
                    }
                }
                else if(i > buscaIndice){
                    if(i < indice_fim){
                        obj[i + 1] = this.array[i];
                    }
                }
            }
            this.array = obj;
            this.indice_fim = this.array.length - 1;
        }
    }

    @Override
    public void insereInicio(int valor) {
        if(this.array != null){
            int[] obj = new int[this.array.length + 1];
            for(int i = 0; i < this.array.length; i++){
                obj[i + 1] = this.array[i];
            }
            obj[0] = valor;
            this.array = obj;
            this.indice_fim = this.array.length - 1;
        }
        else{
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }

    @Override
    public void insereFim(int valor) {
        if(this.array != null){
            int[] obj = new int[this.array.length + 1];
            for(int i = 0; i < this.array.length; i++){
                obj[i] = this.array[i];
            }
            obj[indice_fim + 1] = valor;
            this.array = obj;
            this.indice_fim = this.array.length - 1;
        }
        else{
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }

    @Override
    public void remove(int valor) {
        int[] obj = new int[this.array.length - 1];
        for(int i = 0; i < indice_fim; i++){
            if(this.array[i] != valor){
                obj[i] = this.array[i];            
            }
            else{
                if(i + 1 < obj.length){
                    obj[i] = this.array[i + 1];
                }
            }    
        }
        this.array = obj;
        indice_fim = obj.length - 1;
    }

    @Override
    public void removeIndice(int indice) {
        int[] obj = new int[this.array.length - 1];
        for(int i = 0; i < indice_fim; i++){
            if(i < indice){
                obj[i] = this.array[i];            
            }
            else if(i >= indice){
                if(i + 1 < obj.length){
                    obj[i] = this.array[i + 1];
                }
            }   
        }
        this.array = obj;
        indice_fim = obj.length - 1;
    }

    @Override
    public void removeInicio() {
        if(this.array != null){
            int[] obj = new int[this.array.length - 1];
            for(int i = 1; i < indice_fim; i++){
                obj[i - 1] = this.array[i];
            }
            this.array = obj;
            this.indice_fim = this.array.length - 1;
        }
    }

    @Override
    public void removeFim() {
        if(this.array != null){
            int[] obj = new int[this.array.length - 1];
            for(int i = 0; i < indice_fim; i++){
                obj[i] = this.array[i];
            }
            this.array = obj;
            indice_fim = indice_fim -1;
        }
    }
    
}
