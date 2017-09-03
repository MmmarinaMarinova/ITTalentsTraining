package Library;

import java.util.*;

/**
 * Created by Marina on 3.9.2017 г..
 */
public class Library {
    private String name;
    private TreeMap<ReadingMaterialType,TreeSet<ReadingMaterial>> catalogue;

    public Library(String name) {
        this.name = name;
        this.catalogue =new TreeMap<ReadingMaterialType, TreeSet<ReadingMaterial>>();
        this.catalogue.put(ReadingMaterialType.BOOK, new TreeSet<>(bookComparator));
        this.catalogue.put(ReadingMaterialType.MAGAZINE, new TreeSet<>(magazineComparator));
        this.catalogue.put(ReadingMaterialType.TEXTBOOK, new TreeSet<>(textbookComparator));
    }

    private Comparator<ReadingMaterial> magazineComparator=new Comparator<ReadingMaterial>() {
        @Override
        public int compare( ReadingMaterial o1 , ReadingMaterial o2) {
                if(((Magazine)o1).getCategory().equals(((Magazine)o2).getCategory())){
                    if(o1.getName().equals(o2.getName())){
                        if(((Magazine)o1).getEditionNumber()==((Magazine)o2).getEditionNumber()){
                            return 0;
                        }else{
                            return ((Magazine)o1).getEditionNumber()<((Magazine)o2).getEditionNumber()? -1:1;
                        }
                    }else{
                        return o1.getName().compareTo(o2.getName());
                    }
                }else{
                    return ((Magazine)o1).getCategory().compareTo(((Magazine)o2).getCategory());
                }
            }
        };

    private Comparator<ReadingMaterial> bookComparator=new Comparator<ReadingMaterial>() {
        @Override
        public int compare(ReadingMaterial o1, ReadingMaterial o2) {
            if(((Book)o1).getGenre().equals(((Book)o2).getGenre())){
                if(o1.getPrintDate().isEqual(o2.getPrintDate())){
                    return 0;
                }else{
                    return o1.getPrintDate().isAfter(o2.getPrintDate())? -1:1;
                }
            }else{
                return ((Book)o1).getGenre().compareTo(((Book)o2).getGenre());
            }
        }
    };

    private Comparator<ReadingMaterial> textbookComparator=new Comparator<ReadingMaterial>() {
        @Override
        public int compare(ReadingMaterial o1, ReadingMaterial o2) {
            if(((Textbook)o1).getTopic().equals(((Textbook)o1).getTopic())){
                if(o1.getName().equals(o2.getName())){
                    return 0;
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }else{
                return ((Textbook)o1).getTopic().compareTo(((Textbook)o2).getTopic());
            }
        }
    };


    void printCatalogue(){
        for (Map.Entry<ReadingMaterialType,TreeSet<ReadingMaterial>> type: this.catalogue.entrySet() ) {
            System.out.println(type.getKey().toString()+" :");
            for (ReadingMaterial r:type.getValue()) {
                System.out.println(r.toString());
            }
        }
    }

    void checkForExtendedLend(){
        System.out.println("Extended reading materials: ");
        for (Map.Entry<ReadingMaterialType,TreeSet<ReadingMaterial>> type:this.catalogue.entrySet()) {
            for (ReadingMaterial r:type.getValue()) {
                if(r.isExtended()){
                    r.addTax(10);
                    System.out.println(r.toString());
                }
            }
        }
    }

    public void returnReading(ReadingMaterial readingMaterial, Client client) {
        readingMaterial.isCurrentlyInLibrary=true;
        readingMaterial.setReturnDate();
        if(readingMaterial.getTax()>0){
            client.payForReadingMaterial(readingMaterial.getTax());
        }
    }

    public void addReading(ReadingMaterial readingMaterial) {
        if(this.catalogue.containsKey(readingMaterial.getReadingMaterialType())){
            this.catalogue.get(readingMaterial.getReadingMaterialType()).add(readingMaterial);
        }
    }

    public void printAvailability() {
        for (Map.Entry<ReadingMaterialType, TreeSet<ReadingMaterial>> entry: this.catalogue.entrySet()) {
            System.out.println(entry.getKey()+": ");
            System.out.println(entry.getValue().size()+" available.");
        }
    }

}

