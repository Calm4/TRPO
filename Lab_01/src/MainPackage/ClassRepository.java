package MainPackage;
import java.util.ArrayList;

public class ClassRepository {
	ArrayList<Sneakers> classRepository = new ArrayList<Sneakers>();
	
	// Добавление в список
	public void AddNewKrosovki(Sneakers element) {
		classRepository.add(element);
	}
	// Удаление из списка
	public void RemoveKrosovki(Sneakers sneakers) {
		classRepository.remove(sneakers);
	}
	// Замена элемента в списке
	public void ChangeKrosovki(int index,Sneakers krosovki) {
		classRepository.set(0, krosovki);
	}
	// Возращение списка
	public ArrayList<Sneakers> getSneakersCollection() {
        return this.classRepository;
    }
}

