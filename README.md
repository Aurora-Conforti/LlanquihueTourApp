# LlanquihueTourApp

## Descripción
Sistema de gestión de tours de la agencia **Llanquihue Tour**, ubicada en la comuna de Llanquihue, Región de Los Lagos. El sistema lee los datos de los tours desde un archivo `.txt`, los convierte en objetos Java almacenados en un `ArrayList` y permite recorrer, filtrar y mostrar el catálogo por consola.

## Autora
- **Nombre:** Aurora Conforti
- **Asignatura:** Desarrollo Orientado a Objetos I
- **Semana:** 4

## Estructura del proyecto

```
LlanquihueTourApp/
├── src/
│   ├── model/
│   │     └── Tour.java          → Clase con atributos, getters, setters y toString
│   ├── data/
│   │     └── GestorDatos.java   → Lee el archivo TXT y crea objetos en ArrayList
│   └── ui/
│         └── Main.java          → Clase principal: recorrido y filtros
└── resources/
      └── tours.txt              → Archivo con datos de los tours
```

## Descripción de las clases

| Clase | Paquete | Descripción |
|---|---|---|
| `Tour` | model | Representa un tour con nombre, tipo, precio y cupos disponibles |
| `GestorDatos` | data | Lee el archivo `tours.txt` y crea objetos `Tour` en un `ArrayList` |
| `Main` | ui | Muestra todos los tours, filtra por tipo, precio y cupos |

## Formato del archivo tours.txt

Cada línea representa un tour con el siguiente formato:
```
nombre;tipo;precio;cuposDisponibles
```

Ejemplo:
```
Ruta Gastronomica del Lago;gastronomico;45000;8
Paseo Lacustre Llanquihue;lacustre;32000;12
```

## Filtros implementados en Main

- **Filtro 1:** Tours de tipo `gastronomico`
- **Filtro 2:** Tours con precio menor a `$40.000`
- **Filtro 3:** Tours con más de `5 cupos` disponibles

## Instrucciones para ejecutar

### Desde terminal:
```bash
# Compilar
javac -d out src/model/Tour.java src/data/GestorDatos.java src/ui/Main.java

# Ejecutar
java -cp out:resources ui.Main
```

### Desde NetBeans:
1. Crear proyecto Java con nombre `LlanquihueTourApp`
2. Crear paquetes: `model`, `data`, `ui`
3. Crear carpeta `resources` en la raíz del proyecto
4. Copiar cada archivo `.java` en su paquete correspondiente
5. Clic derecho sobre `Main.java` → **Run File**
