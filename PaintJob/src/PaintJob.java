public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <=0 || height <=0 || areaPerBucket <=0 || extraBuckets <0) {
            return -1;
        } else {
            double uncoveredArea = (width*height)-areaPerBucket*extraBuckets;
            double bucketCounter = uncoveredArea / areaPerBucket;
            if(uncoveredArea % areaPerBucket == 0) {
                return Math.round((int)bucketCounter);
            } else {
                return Math.round((int)bucketCounter+1);
            }
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width<=0 || height <=0 || areaPerBucket <=0) {
            return -1;
        } else {
            double bucketCounter = (width*height)/areaPerBucket;
            if((width*height)%bucketCounter ==0) {
                return Math.round((int)bucketCounter);
            } else {
                return Math.round((int)bucketCounter+1);
            }
        }
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <=0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double bucketCounter = area/areaPerBucket;
            if(area%areaPerBucket==0) {
                return Math.round((int)bucketCounter);
            }
            return Math.round((int)bucketCounter+1);
        }
    }
}
