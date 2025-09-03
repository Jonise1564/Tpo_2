package viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import model.Libro;
import model.RespositorioLibro;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> libroEncotrado;
    private final RespositorioLibro repositorio = new RespositorioLibro();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

        public LiveData<Libro> getlibroEncotrado() {
            if (libroEncotrado == null){
                libroEncotrado = new MutableLiveData<>();
            }
            return libroEncotrado;
        }

    public void buscarLibro(String titulo) {
        Libro resultado = repositorio.buscarPorTitulo(titulo);
        libroEncotrado.setValue(resultado);
    }
}
