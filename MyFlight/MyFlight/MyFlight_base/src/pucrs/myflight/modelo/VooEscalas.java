package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo
    {
        private Rota rotaFinal;
        public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime dh, Duration dur) {
            super(rota, dh, dur);
            this.rotaFinal = rotaFinal;
         }
}
