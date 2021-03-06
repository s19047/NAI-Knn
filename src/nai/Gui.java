/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nai;
import java.awt.Color;
import java.awt.List;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author ِِAHMAD ALAZIZ S19047
 * 
 * note: even though this was first intended as a Knn project to get iris subspecies
 * I decided to make a program that could get the knn result no matter how many 
 * possible outcomes , or input columns are used , thus i use hashmaps and arraylists
 * 
 */
public class Gui extends javax.swing.JFrame {

    //file chooser to chosoe files
    public JFileChooser openFileChooser;
    
    //decision array list
    public ArrayList<String> decision ;
    
    //public ArrayList<Integer>[] inputArr = new ArrayList<Integer>[5];
    ArrayList<Double>[] inputArr;
    
    // min and max for normalization:
    public static ArrayList<Double> max  = new ArrayList<Double>() ,min = new ArrayList<Double>() ;
    
    //HashMap of possible outcomes , 
    Map<String,Integer> outcomes = new HashMap<String, Integer>();
    
    //if we found a value were distance is zero 
    public static boolean disZero = false;
    public static int indexZero = 0;
    public static Set<String> hashSet ;
    
    public Gui() {
        initComponents();
        openFileChooser = new JFileChooser();
       openFileChooser.setFileFilter(new FileNameExtensionFilter("text files only", "txt"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trainBtn = new javax.swing.JButton();
        msgLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        kField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        helpBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        paramField = new javax.swing.JTextField();
        resultLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputTestBtn = new javax.swing.JButton();
        accuracyLbl = new javax.swing.JLabel();
        kField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        predictBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("s19047- Ahmad Alaziz");
        setBackground(new java.awt.Color(102, 102, 102));

        trainBtn.setText("read training file");
        trainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        kField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("K:");

        helpBtn.setLabel("How to use!");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Input Parameters:");

        paramField.setToolTipText("e.g. : 5.3 3.7 1.5 0.2");
        paramField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paramFieldActionPerformed(evt);
            }
        });

        resultLbl.setText("Predicted Result");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Make Prediction:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Test Accuracy:");

        inputTestBtn.setText("Input Test DataSet");
        inputTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTestBtnActionPerformed(evt);
            }
        });

        accuracyLbl.setText("Accuracy");

        kField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kField2ActionPerformed(evt);
            }
        });

        jLabel8.setText("K:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel5.setText("Note:  please enter un-normalized paramaters also remember you can't excede more parameters than  the ones used in the traning file");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel7.setText("Note:  make sure to  write  value of k before inputting the test dataSet");

        predictBtn.setText("Predict !");
        predictBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predictBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(trainBtn)
                        .addGap(34, 34, 34)
                        .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTestBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paramField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(predictBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accuracyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(trainBtn)
                        .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(paramField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(resultLbl)
                    .addComponent(predictBtn))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(accuracyLbl)
                    .addComponent(inputTestBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void message( String m , boolean b){
        if(b == true){
              msgLbl.setForeground(Color.black);
            msgLbl.setText(m);
           
        }else{
           
            msgLbl.setForeground(Color.red);
            msgLbl.setText(m);
            
        }
    }
    private void trainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainBtnActionPerformed
      
        int returnVal = openFileChooser.showOpenDialog(this);
        
        if((returnVal == JFileChooser.APPROVE_OPTION)){
            //Read from file 
            try{
                File f = openFileChooser.getSelectedFile();
                FileReader inputRead = new FileReader(f);
                BufferedReader buf = new BufferedReader(inputRead);

                //clear text Area
                textArea.setText("");
                
                //clear min and max for normalization 
                //incase program was used on a different set before
                min.clear(); max.clear();
                
                // read firstline
                String line = buf.readLine();
                
                // split row by whitespaces
                String[] row= line.trim().split("\\s+");
                
                // initialize our array of arrayList with the number of input parameters
                inputArr = (ArrayList<Double>[])new ArrayList[row.length-1];
                
                //initialize our decision arraylist with decision
                 decision= new ArrayList<String>();
                 decision.add(row[row.length-1]);
                 
                //initialize arrayLists
                for(int i = 0; i < row.length-1; i++){
                    inputArr[i] = new ArrayList<Double>();
                }

                //parse each double into it's respected arrayList
                message(Integer.toString(row.length),true);
                for(int i = 0; i < row.length-1; i++){
                    System.out.println("test");
                    System.out.println(Double.toString(Double.parseDouble(row[i])));
                 inputArr[i].add(Double.parseDouble(row[i]));
                }
                
                while ( ( line = buf.readLine() )!= null){
                    
                    row = line.trim().split("\\s+");
                    for(int i = 0; i < row.length-1; i++){
                        inputArr[i].add(Double.parseDouble(row[i]));
                    }
                    decision.add(row[row.length-1]);
                    
                }
                
                //create hashset for our decision outcomes to get only unique values
                 hashSet = new HashSet<>(decision);
                
                //and then put them into my hashmap , because i want to use their keys to order
                //which is more probable when predicting
                 hashSet.forEach(e -> outcomes.put(e, 0));
               
                //test
                outcomes.entrySet().forEach(entry->{
                  System.out.println("Outcomes : "+entry.getKey() + " " + entry.getValue());  
                });
                
                textArea.append(Integer.toString(row.length)+"\n");
                
                for(int i = 0; i < row.length -1; i++){
                     textArea.append( "input-"+(char)(65+i)+ " :                    " + 
                         Arrays.toString(inputArr[i].toArray())+"\n" );
                 textArea.append( "input-"+(char)(65+i)+ "-normalized :"       + 
                         (Arrays.toString(normalizeList(inputArr[i]).toArray())+"\n") );
                }
                textArea.append( ("Decision:                  " +
                        Arrays.toString(decision.toArray())+"\n") );

                
                message("success",true);
                 buf.close();
            }catch(IOException e){
                message(e.getMessage(),false);
            }

        }else{
            message("Error in uploading file", false);
        }
       
        //CloseFile Reader
        
    }//GEN-LAST:event_trainBtnActionPerformed

    private void kFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kFieldActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
          JOptionPane.showMessageDialog(this, "If you want the algorithm to "
                  + "predict a result for you , Please make sure "
                  + "you have already  trained it , using the read training file"
                  + " ,\n" +" then please enter your input paramters "
                  + "in the parameters textField (you should have a space between each paramter and the next)  ,"
                  + " then enter your value of k , \n"
                  + "then press predict.  If you want to test the algorithm "
                  + "with your \n" + "own dataset , first enter K then press the test button ( make "
                  + "sure the algorithm has been trained already ) ");
    }//GEN-LAST:event_helpBtnActionPerformed

    private void paramFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paramFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paramFieldActionPerformed

    private void inputTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTestBtnActionPerformed
         int returnVal = openFileChooser.showOpenDialog(this);
        
        if((returnVal == JFileChooser.APPROVE_OPTION)){
            //Read from file 
            try{
                File f = openFileChooser.getSelectedFile();
                FileReader inputRead = new FileReader(f);
                BufferedReader buf = new BufferedReader(inputRead);
                
                // read firstline
                String line = buf.readLine();
                
                // split row by whitespaces
                String[] row= line.trim().split("\\s+");
                
                //initiilize our parameters array
                double[] parameters = new double[row.length-1];
                
                //get k 
                int k = Integer.parseInt(kField2.getText());
                
                //Total number of correct answers
                int correct = 0;
                
                for(int i = 0; i < row.length-1; i++){
                        parameters[i] = (Double.parseDouble(row[i]));
                    }
                
                   if(row[row.length-1].equals(Predict(parameters,k))){
                       ++correct;
                   }
                    
                 int lineCount = 1;
                 while ( ( line = buf.readLine() )!= null){
                    ++lineCount;
                    row = line.trim().split("\\s+");
                  //  JOptionPane.showMessageDialog(this,"row: "+ Arrays.toString(row));
                    
                    for(int i = 0; i < row.length-1; i++){
                        parameters[i] = (Double.parseDouble(row[i]));
                       // JOptionPane.showMessageDialog(this,"parameter "+ i+" :" +parameters[i]);
                    }
                    
                     String correctAnswer = " NO";
                  
                      if(row[row.length-1].equals(Predict(parameters,k))){
                       ++correct;
                       correctAnswer = " Yes";
                   }
                   
                    
                   //JOptionPane.showMessageDialog(this, "param[1] : "+parameters[1]+" ,k: "+k+ row[row.length-1] + " , " + Predict(parameters,k) + " ," + correctAnswer + ", correct:"+ correct + ", line:" + lineCount);
                }
                 
                 
                 //calculate accuracy
                 double accuracy = 100*((double)correct/(double)lineCount);
                 String strAccuracy= String.format("%.2f", accuracy);
            JOptionPane.showMessageDialog(this, strAccuracy);
                  JOptionPane.showMessageDialog(this, "The algorithm got "+correct+" out of "+ lineCount+ " !");
                 accuracyLbl.setText(String.valueOf("The Accuracy of this algorithm using k as "+ k + " is: "+strAccuracy+"%"));
                 
            }catch(IOException e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_inputTestBtnActionPerformed

    private void kField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kField2ActionPerformed

   
    
    private void predictBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predictBtnActionPerformed
        
        if("success".equals(msgLbl.getText())){
            
            //get paramter array from passed string
            double[] parameters = Arrays.stream(paramField.getText().trim().split("\\s+"))
                        .mapToDouble(Double::parseDouble)
                        .toArray();

            //get k from kfield
            if(!kField.getText().trim().equals("")){
                int k = Integer.parseInt(kField.getText());
                resultLbl.setText(Predict(parameters,k));
            
            }else{
                JOptionPane.showMessageDialog(this, "please enetr a value for k");
            }
        }else{
            JOptionPane.showMessageDialog(this, "make sure you have already trained teh algorithm !");
        }
    }//GEN-LAST:event_predictBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    
     public  String Predict(double[] parameters, int k){
         
         
        double[] param = parameters.clone();
        ArrayList<Double> distances = calcDistances(param,inputArr);
        
        if(!disZero){
            //PRINT CALCULATED DISTANCES
            textArea.append( (": Distances" +
                    Arrays.toString(distances.toArray())+"\n") );
            
             for(int i = 1 ; i< k+1 ; i++){
                    //get the decision at the index of the kth smallest element
                    String dec = decision.get(distances.indexOf(findKthSmallestElement(distances,i))) ;
                    incrementValue(outcomes,dec);
                }

                int max = 0;
                String key  = "";
                for (String name: outcomes.keySet()){

                        int value = outcomes.get(name); 
                        if( value > max){
                            key = name.toString();
                            max = value;
                        }   
                } 
            outcomes.clear();
            hashSet.forEach(e -> outcomes.put(e, 0));
            return key;    
        }else{
            disZero = false;
            return decision.get(indexZero);
        }

        
    }
     
    //normalize array list
    public static ArrayList<Double>normalizeList(ArrayList<Double> a){
        
        // get max and min values inorder to normalize
        ArrayList<Double> sortedlist = new ArrayList<>(a); 
  
        // sort list in natural order 
        Collections.sort(sortedlist); 
  
        // last element in the sorted list would be maximum 
         max.add(sortedlist.get(sortedlist.size() - 1)); 
        
        //first element in the sorted list would be minimum
          min.add(sortedlist.get(0)); 
         
         //normalize
        for(int i = 0; i < a.size(); i++){
            double value = (double)((a.get(i) - min.get(min.size()-1) ) / ( max.get(max.size()-1) - min.get(min.size()-1))) ;
            a.set(i, ( value ) );
           
        }
        return a;
    }
    
    //normalize the parameters
     public static double[]normalizeParam(double[] param){

         
         //normalize
        for(int i = 0; i < param.length; i++){
            param[i]= (double)( (param[i] - min.get(i)) / (max.get(i) - min.get(i) )) ;
        }
        return param;
         
    }
    
    
    
    public static ArrayList<Double> calcDistances(double[] paramArr2, ArrayList<Double>[] inputArr){
        ArrayList<Double> distancesList  = new ArrayList<Double>();
        distancesList.clear();
        
        Double distance = 0.0;
        paramArr2 = normalizeParam(paramArr2);
        
        for( int i = 0; i < inputArr[0].size(); i++ ){
            
            distance = 0.0;
            
            for(int j = 0 ; j < paramArr2.length; j++){
                    distance =  distance + Math.pow(paramArr2[j]-inputArr[j].get(i), 2)   ;
            }
            
            if(distance == 0){
                disZero = true;
                indexZero = i;
            }
            //We don't really need to calculate the squareRoot 
            //but I thought i'd do it anyway
            distancesList.add((distance)); 
            
        }
        
        return distancesList;
    }
    public Double findKthSmallestElement(ArrayList<Double> a, int k){

 
        PriorityQueue<Double>  maxHeap =
                new PriorityQueue<>(k, Collections.reverseOrder());

        if(a == null || k > a.size()) return -1.1;
        //Create max with first k elements
        for(int i=0; i<k; i++){
            maxHeap.add(a.get(i));
        }

        /*Keep updating max heap based on new element
        If new element is less than root, 
        remove root and add new element
        */

        for(int i=k; i<a.size(); i++){
            if(maxHeap.peek() > a.get(i)){
                maxHeap.remove();
                maxHeap.add(a.get(i));
            }

    }
    return maxHeap.peek();
}
     public static<K> void incrementValue(Map<K,Integer> map, K key)
    {
        // get value of the specified key
        Integer count = map.get(key);
        
        // if the map contains no mapping for the key, then
        // map the key with value of 1
        if (count == null) {
            map.put(key, 1);
        }
        // else increment the found value by 1
        else {
            map.put(key, count + 1);
        }
    }
     public static <K extends Comparable<K>, V> Map.Entry<K, V> 
    getMaxEntryInMapBasedOnKey(Map<K, V> map) 
    { 
        // To store the result 
        Map.Entry<K, V> entryWithMaxKey = null; 
  
        // Iterate in the map to find the required entry 
        for (Map.Entry<K, V> currentEntry : map.entrySet()) { 
  
            if ( 
  
                // If this is the first entry, 
                // set the result as this 
                entryWithMaxKey == null
  
                // If this entry's key is more than the max key 
                // Set this entry as the max 
                || currentEntry.getKey() 
                           .compareTo(entryWithMaxKey.getKey()) 
                       > 0) { 
  
                entryWithMaxKey = currentEntry; 
            } 
        } 
  
        // Return the entry with highest key 
        return entryWithMaxKey; 
    } 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accuracyLbl;
    private javax.swing.JButton helpBtn;
    private javax.swing.JButton inputTestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kField;
    private javax.swing.JTextField kField2;
    private javax.swing.JLabel msgLbl;
    private javax.swing.JTextField paramField;
    private javax.swing.JButton predictBtn;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton trainBtn;
    // End of variables declaration//GEN-END:variables
}
