
package AdvanceStage.Annotations;


class DeprecatedAnnotation {
      /**
     * @deprecated This method is deprecated and will be removed in future versions.
     * Use newMethod() instead.
     */
    @Deprecated
    public void oldMethod() {
        System.out.println("This is the old method.");
    }

    public void newMethod() {
        System.out.println("This is the new method.");
    }
  public static void main(String[] args) {
    
  }

}