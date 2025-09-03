package viewModel;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import model.Libro;

public class SecondViewModel extends AndroidViewModel {

    private final MutableLiveData<Libro> libro = new MutableLiveData<>();

    public SecondViewModel(@NonNull Application application) {
        super(application);
    }

    public void setLibro(Libro libroRecibido) {
        libro.setValue(libroRecibido);
    }

    public LiveData<Libro> getLibro() {
        return libro;
    }
}
