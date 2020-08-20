package labs_examples.datastructures.hashmap.labs;

public class ObjectOfData<X, Y> {
    private X objectCategory;
    private Y objectInfo;

    ObjectOfData next = null;

    public ObjectOfData(X objectCategory, Y objectInfo) {
        this.objectCategory = objectCategory;
        this.objectInfo = objectInfo;
    }

    public X getObjectCategory() {
        return objectCategory;
    }

    public Y getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(Y objectInfo) {
        this.objectInfo = objectInfo;
    }
}
