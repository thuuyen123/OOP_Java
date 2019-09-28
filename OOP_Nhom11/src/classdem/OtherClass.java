
package classdem;


public class OtherClass extends AbstractClassDemo {

    @Override
    public String getOld() {
       return (super.getAge()>=50)?"old":"adult";
    }

    @Override
    public int getNumberOfWords() {
        String nn=super.getName();
        String[] st=nn.split(" ");
        return st.length;
        
    }
    
}
