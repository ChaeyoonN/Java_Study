package etc.generic.basic02;

//멀티 제네릭 (key, value)
public class Box<K, V> {
	
	private K key;
	private V value;
	
	
	//생성자
	public Box(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
	//메서드
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public V get(K key) {
		return this.value;
	}


	@Override
	public String toString() {
		return "{" + key + "=" + value + "}";
	}
	
	
	
	
	
	
	
}
