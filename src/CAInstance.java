
public class CAInstance implements Instance
{
   private static enum A1 {b, a}; 
   private static enum A4 {u, y, l, t}; 
   private static enum A5 {g, p, gg} 
   private static enum A6 {c, d, cc, i, j, k, m, r, q, w, x, e, aa, ff}; 
   private static enum A7 {v, h, bb, j, n, z, dd, ff, o}; 
   private static enum A9 {t, f}; 
   private static enum A10{t, f}; 
   private static enum A12{t, f}; 
   private static enum A13{g, p, s};
   
   private Attribute<A1> a1Val;
   private Attribute<Double> a2Val;
   private Attribute<Double> a3Val;
   private Attribute<A4> a4Val;
   private Attribute<A5> a5Val;
   private Attribute<A6> a6Val;
   private Attribute<A7> a7Val;
   private Attribute<Double> a8Val;
   private Attribute<A9> a9Val;
   private Attribute<A10> a10Val;
   private Attribute<Double> a11Val;
   private Attribute<A12> a12Val;
   private Attribute<A13> a13Val;
   private Attribute<Double> a14Val; 
   private Attribute<Double> a15Val; 
   private Attribute<Character> a16Val;
   private String predictionLabel;
   private int instanceId;
   public CAInstance(String[] data, int instanceId) {
      if(data.length != 16) {
         //TODO
         System.exit(1);
      }
      this.instanceId = instanceId;
      this.a1Val = data[0].equals("?") ? new Attribute<A1>(null, true) : new Attribute<A1>(A1.valueOf(data[0]), false);
      this.a2Val = data[1].equals("?") ? new Attribute<Double>(null, true) : new Attribute<Double>(Double.parseDouble(data[1]), false);
      this.a3Val = data[2].equals("?") ? new Attribute<Double>(null, true) : new Attribute<Double>(Double.parseDouble(data[2]), false);
      this.a4Val = data[3].equals("?") ? new Attribute<A4>(null, true) : new Attribute<A4>(A4.valueOf(data[3]), false);
      this.a5Val = data[4].equals("?") ? new Attribute<A5>(null, true) : new Attribute<A5>(A5.valueOf(data[4]), false);
      this.a6Val = data[5].equals("?") ? new Attribute<A6>(null, true) : new Attribute<A6>(A6.valueOf(data[5]), false);
      this.a7Val = data[6].equals("?") ? new Attribute<A7>(null, true) : new Attribute<A7>(A7.valueOf(data[6]), false);
      this.a8Val = data[7].equals("?") ? new Attribute<Double>(null, true) : new Attribute<Double>(Double.parseDouble(data[7]), false);
      this.a9Val = data[8].equals("?") ? new Attribute<A9>(null, true) : new Attribute<A9>(A9.valueOf(data[8]), false);
      this.a10Val = data[9].equals("?") ? new Attribute<A10>(null, true) : new Attribute<A10>(A10.valueOf(data[9]), false);
      this.a11Val = data[10].equals("?") ? new Attribute<Double>(null, true) : new Attribute<Double>(Double.parseDouble(data[10]), false);
      this.a12Val = data[11].equals("?") ? new Attribute<A12>(null, true) : new Attribute<A12>(A12.valueOf(data[11]), false);
      this.a13Val = data[12].equals("?") ? new Attribute<A13>(null, true) : new Attribute<A13>(A13.valueOf(data[12]), false);
      this.a14Val = data[13].equals("?") ? new Attribute<Double>(null, true) : new Attribute<Double>(Double.parseDouble(data[13]), false);
      this.a15Val = data[14].equals("?") ? new Attribute<Double>(null, true) : new Attribute<Double>(Double.parseDouble(data[14]), false);
      this.a16Val = data[15].equals("?") ? new Attribute<Character>(null, true) : new Attribute<Character>(data[15].charAt(0), false);
   }

   public boolean hasMissingValue() {
      if(this.a1Val.isMissingValue()) {
         return true; 
      }
      if(this.a2Val.isMissingValue()) {
         return true; 
      }
      if(this.a3Val.isMissingValue()) {
         return true; 
      }
      if(this.a4Val.isMissingValue()) {
         return true; 
      }
      if(this.a5Val.isMissingValue()) {
         return true; 
      }
      if(this.a6Val.isMissingValue()) {
         return true; 
      }
      if(this.a7Val.isMissingValue()) {
         return true; 
      }
      if(this.a8Val.isMissingValue()) {
         return true; 
      }
      if(this.a9Val.isMissingValue()) {
         return true; 
      }
      if(this.a10Val.isMissingValue()) {
         return true; 
      }
      if(this.a11Val.isMissingValue()) {
         return true; 
      }
      if(this.a12Val.isMissingValue()) {
         return true; 
      }
      if(this.a13Val.isMissingValue()) {
         return true; 
      }
      if(this.a14Val.isMissingValue()) {
         return true; 
      }
      if(this.a15Val.isMissingValue()) {
         return true; 
      }
      if(this.a16Val.isMissingValue()) {
         return true; 
      }
      return false;
   }
   
   public String getStringValueByIndex(int attributeIndex) {
      String val = null;
      switch(attributeIndex) {
      case 0:
         if(!this.a1Val.isMissingValue())
            val = this.a1Val.getValue().name();
         break;
      case 3:
         if(!this.a4Val.isMissingValue())
            val = this.a4Val.getValue().name();
         break;
      case 4:
         if(!this.a5Val.isMissingValue())
            val = this.a5Val.getValue().name();
         break;
      case 5:
         if(!this.a6Val.isMissingValue())
            val = this.a6Val.getValue().name();
         break;
      case 6:
         if(!this.a7Val.isMissingValue())
            val = this.a7Val.getValue().name();
         break;
      case 8:
         if(!this.a9Val.isMissingValue())
            val = this.a9Val.getValue().name();
         break;
      case 9:
         if(!this.a10Val.isMissingValue())
            val = this.a10Val.getValue().name();
         break;
      case 11:
         if(!this.a12Val.isMissingValue())
            val = this.a12Val.getValue().name();
         break;
      case 12:
         if(!this.a13Val.isMissingValue())
            val = this.a13Val.getValue().name();
         break;
      default:
         val = null;
      }
      return val;
   }
   
   public Attribute<Double> getDoubleValueByIndex(int attributeIndex) {
      Attribute<Double> val;
      switch(attributeIndex) {
      case 1:
         val = this.a2Val;
         break;
      case 2:
         val = this.a3Val;
         break;
      case 7:
         val = this.a8Val;
         break;
      case 10:
         val = this.a11Val;
         break;
      case 13:
         val = this.a14Val;
         break;
      case 14:
         val = this.a15Val;
         break;
      default:
         val = null;
      }
      return val;
   }
   
   public void replaceMissingDoubles(double... means) {
      double a2Mean = means[0];
      double a3Mean = means[1];
      double a8Mean = means[2];
      double a11Mean = means[3];
      double a14Mean = means[4];
      double a15Mean = means[5];
      if(a2Val.isMissingValue()) {
         a2Val.setValue(a2Mean);
      }
      if(a3Val.isMissingValue()) {
         a3Val.setValue(a3Mean);
      }
      if(a8Val.isMissingValue()) {
         a8Val.setValue(a8Mean);
      }
      if(a11Val.isMissingValue()) {
         a11Val.setValue(a11Mean);
      }
      if(a14Val.isMissingValue()) {
         a14Val.setValue(a14Mean);
      }
      if(a15Val.isMissingValue()) {
         a15Val.setValue(a15Mean);
      }
   }
   
   public void replaceMissingStrings(String... medians) {
      String a1Median = medians[0];
      String a4Median = medians[1];
      String a5Median = medians[2];
      String a6Median = medians[3];
      String a7Median = medians[4];
      String a9Median = medians[5];
      String a10Median = medians[6];
      String a12Median = medians[7];
      String a13Median = medians[8];
      if(a1Val.isMissingValue()) {
         A1 val = A1.valueOf(a1Median);
         a1Val.setValue(val);
      }
      if(a4Val.isMissingValue()) {
         A4 val = A4.valueOf(a4Median);
         a4Val.setValue(val);
      }
      if(a5Val.isMissingValue()) {
         A5 val = A5.valueOf(a5Median);
         a5Val.setValue(val);
      }
      if(a6Val.isMissingValue()) {
         A6 val = A6.valueOf(a6Median);
         a6Val.setValue(val);
      }
      if(a7Val.isMissingValue()) {
         A7 val = A7.valueOf(a7Median);
         a7Val.setValue(val);
      }
      if(a9Val.isMissingValue()) {
         A9 val = A9.valueOf(a9Median);
         a9Val.setValue(val);
      }
      if(a10Val.isMissingValue()) {
         A10 val = A10.valueOf(a10Median);
         a10Val.setValue(val);
      }
      if(a12Val.isMissingValue()) {
         A12 val = A12.valueOf(a12Median);
         a12Val.setValue(val);
      }
      if(a13Val.isMissingValue()) {
         A13 val = A13.valueOf(a13Median);
         a13Val.setValue(val);
      }
   }
   
   public String getLabel(){
      return Character.toString(this.a16Val.getValue());
   }

   public double getL2Distance(Instance i) {
      double distance = 0;
      distance = calculateDoubleDistance((CAInstance)i);
      distance+=calculateCategoricalDistance((CAInstance)i);
      return Math.sqrt(distance);
   }
   
   private double calculateDoubleDistance(CAInstance i) {
      double result = 0;
      result = Math.pow(i.getA2Val().getValue()-this.getA2Val().getValue(), 2);
      result += Math.pow(i.getA3Val().getValue()-this.getA3Val().getValue(), 2);
      result += Math.pow(i.getA8Val().getValue()-this.getA8Val().getValue(), 2);
      result += Math.pow(i.getA11Val().getValue()-this.getA11Val().getValue(), 2);
      result += Math.pow(i.getA14Val().getValue()-this.getA14Val().getValue(), 2);
      result += Math.pow(i.getA15Val().getValue()-this.getA15Val().getValue(), 2);
      return result;
   }
   
   private double calculateCategoricalDistance(CAInstance i) {
      double result = 0;
      result = i.getA1Val().getValue().equals(this.getA1Val().getValue()) ? 0 : 1;
      result += i.getA4Val().getValue().equals(this.getA4Val().getValue()) ? 0 : 1;
      result += i.getA5Val().getValue().equals(this.getA5Val().getValue()) ? 0 : 1;
      result += i.getA6Val().getValue().equals(this.getA6Val().getValue()) ? 0 : 1;
      result += i.getA7Val().getValue().equals(this.getA7Val().getValue()) ? 0 : 1;
      result += i.getA9Val().getValue().equals(this.getA9Val().getValue()) ? 0 : 1;
      result += i.getA10Val().getValue().equals(this.getA10Val().getValue()) ? 0 : 1;
      result += i.getA12Val().getValue().equals(this.getA12Val().getValue()) ? 0 : 1;
      result += i.getA13Val().getValue().equals(this.getA13Val().getValue()) ? 0 : 1;
      return result;
   }
   
   @Override
   public String toString()
   {
      return a1Val.getValue() + "," + a2Val.getValue() + "," + 
            a3Val.getValue() + "," + a4Val.getValue() + "," + a5Val.getValue() + "," + 
            a6Val.getValue() + "," + a7Val.getValue() + "," + a8Val.getValue() + "," + 
            a9Val.getValue() + "," + a10Val.getValue() + "," + a11Val.getValue() + "," + 
            a12Val.getValue() + "," + a13Val.getValue() + "," + a14Val.getValue() + "," + 
            a15Val.getValue() + "," + a16Val.getValue();
   }

   public Attribute<A1> getA1Val()
   {
      return a1Val;
   }

   public Attribute<Double> getA2Val()
   {
      return a2Val;
   }

   public Attribute<Double> getA3Val()
   {
      return a3Val;
   }

   public Attribute<A4> getA4Val()
   {
      return a4Val;
   }

   public Attribute<A5> getA5Val()
   {
      return a5Val;
   }

   public Attribute<A6> getA6Val()
   {
      return a6Val;
   }

   public Attribute<A7> getA7Val()
   {
      return a7Val;
   }

   public Attribute<Double> getA8Val()
   {
      return a8Val;
   }

   public Attribute<A9> getA9Val()
   {
      return a9Val;
   }

   public Attribute<A10> getA10Val()
   {
      return a10Val;
   }

   public Attribute<Double> getA11Val()
   {
      return a11Val;
   }

   public Attribute<A12> getA12Val()
   {
      return a12Val;
   }

   public Attribute<A13> getA13Val()
   {
      return a13Val;
   }

   public Attribute<Double> getA14Val()
   {
      return a14Val;
   }

   public Attribute<Double> getA15Val()
   {
      return a15Val;
   }

   public Attribute<Character> getA16Val()
   {
      return a16Val;
   }

   public String getPredictionLabel()
   {
      return predictionLabel;
   }
   
   public void setPredictionLabel(String s) {
      this.predictionLabel = s;
   }
   
   public int getInstanceId() {
      return this.instanceId;
   }
}
