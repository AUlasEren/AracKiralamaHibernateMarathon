package com.ulas.utility;
/**
 * İlişkisel ya da ilişkisel olmayan tüm db yapılarında kullanılmak üzerer genişletilebilir entegre edilebilir bir
 * kullanamk için bu interface kullanılacaktır
 * <T> Entity type belirtir (Musteri,Product)
 * <ID> Entity içindeki @Id ile belirlenmiş idyi temsil eder.
 * bu idnin type girilmelidir. (long,String)
 */
public interface IMyRepository<T,ID> {


}
