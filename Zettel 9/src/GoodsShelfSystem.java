public class GoodsShelfSystem {
    public GoodsSegment[] Shelf;

    /**
     * constructor of GoodsShelfSystem
     */
    public GoodsShelfSystem() {
        //create 5 segments
        this.Shelf = new GoodsSegment[5];
        this.Shelf[0] = new GoodsSegment(12.6, 21.3, 24.9, 100);
        this.Shelf[1] = new GoodsSegment(24.9, 18.3, 15.6, 150);
        this.Shelf[2] = new GoodsSegment(21.9, 18.3, 30.66, 200);
        this.Shelf[3] = new GoodsSegment(24.36, 27.63, 18.93, 400);
        this.Shelf[4] = new GoodsSegment(12.3, 15.93, 27.36, 360);
    }

    /**
     * method to add a crate to the shelf in the best fitting compartment
     * 1. check all shelfs
     * 2. check if crate fits in compartment and other requirements are met
     * 3. compare what fits better
     */
    public boolean findSegmentForCrate(GoodsCrate crate) {
        if (crate == null) {
            System.out.println("No crate was inputted");
            return false;
        }
        //create temporary segment for comparison
        GoodsSegment temp = null;
        //check all segments
        for (int i = 0; i < Shelf.length; i++) {
            //check if crate fits in compartment and other requirements are met
            if ((Shelf[i].hasEmpty() >= 0) && (Shelf[i].getTotalWeight() + crate.weight <= Shelf[i].maxWeight) && (Shelf[i].crateFits(crate))) {
                //if temp is not set
                if (temp != null) {
                    //if current segment fits better then temp segme
                    if ((Shelf[i].width < temp.width) || (Shelf[i].depth < temp.depth)) {
                        temp = Shelf[i];
                    }
                //set initial temp segment
                }else {
                    temp = Shelf[i];
                }
            }
        }
        //add current temp
        if(temp != null){
            temp.addCrate(crate);
            return true;
        }
        //nothing found
        else{
            return false;
        }
    }
}
