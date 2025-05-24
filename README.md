# 🏴‍☠️ Buscando el Tesoro

**Proyecto final para la asignatura Lógica de Programación y Laboratorio**  
**Programa:** Tecnología en Desarrollo de Software (ITM)

---

## 📋 Descripción

Este proyecto consiste en el desarrollo de un juego interactivo llamado **"Buscando el Tesoro"**, donde el jugador debe adivinar la ubicación de un tesoro oculto en un tablero. La aplicación fue construida utilizando **JavaFX**, aplicando los principios de la **programación orientada a objetos**, buenas prácticas de codificación y separación lógica por paquetes.

---

## 🎮 ¿Cómo funciona el juego?

1. El jugador define el **tamaño del tablero**.  
2. El sistema **genera una matriz** con un tesoro oculto en una posición aleatoria.  
3. El jugador **ingresa coordenadas** para intentar encontrar el tesoro.  
4. El sistema informa si el jugador **acertó o falló**.  
5. Si acierta:  
   - Se muestra un mensaje de felicitación con las coordenadas encontradas.  
   - Se marca el tesoro en el tablero con `:D`.  
   - Se pregunta si desea jugar de nuevo.

---

## ✅ Requerimientos Implementados

| ID  | Requerimiento                                                                 |
| --- | ------------------------------------------------------------------------------ |
| 1   | Código organizado por paquetes. Lógica separada de la vista.                   |
| 2   | Solicitud del tamaño del tablero al usuario.                                   |
| 3   | Mostrar `:D` en el tablero cuando el tesoro sea encontrado.                    |
| 4   | Validación de coordenadas ingresadas.                                          |
| 5   | Mensaje de victoria + coordenadas + opción de reiniciar partida.               |

---

## 📦 Estructura del Proyecto

```bash
src/
├── itm/edu/juego/       # Lógica principal del juego
├── itm/edu/vista/       # Vista con JavaFX
├── itm/edu/util/        # Utilidades (validaciones, generación aleatoria, etc.)
└── itm/edu/recursos/    # Recursos gráficos y diagrama de clases (UML)

🧠 Tecnologías y Herramientas
-----------------------------

*   🖥️ **Java 21+**
    
*   🎨 **JavaFX** (modo gráfico)
    
*   📐 **UML** (diagrama de clases con herramienta profesional)
    
*   🧪 Principios **SOLID** y buenas prácticas de programación
    

🧾 Cómo ejecutar
----------------

1.  Clona el repositorio.
    
2.  Asegúrate de tener configurado **JavaFX** en tu entorno de desarrollo.
    
3.  Compila y ejecuta la clase principal Main.java desde itm.edu.juego.
    
4.  ¡Empieza a buscar el tesoro! 🗺️
    

📷 Captura de pantalla (Vista actual)
-------------------------------------

👥 Créditos
-----------

**Desarrollado por:**

*   Nombre Santiago Molano Holguín
    
*   Nombre Samuel Olaya Olaya
    
*   Nombre Kevin Alvarez Blandon
