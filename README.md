# Katas para OCP (Principio de Abierto/Cerrado)

El Principio de Abierto/Cerrado (OCP) establece que las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para extensión, pero cerradas para modificación.

## Grupo 4
- Cesar Nilton Vincenty Funes
- Paul Larry Anderson Zabala
- Julio Cesar Mamani Condori
- Jose David Ripalda Fernandez

## Kata 4: Sistema de Reportes

**Objetivo:** Generar diferentes tipos de reportes sin modificar el código existente.

- Crear una interfaz ReportGenerator con un método generateReport().
- Implementar las clases PDFReportGenerator y ExcelReportGenerator.
- Introducir un nuevo tipo de reporte, HTMLReportGenerator.
- Refactorizar: Asegurarse de que el nuevo tipo de reporte se integre sin modificar las clases existentes.

## Pasos para Cada Kata

- Comprender el Problema: - Leer la descripción de la kata. - Identificar cómo se puede extender el sistema sin modificar el código existente.
- Implementar el Código: - Crear la interfaz y las clases iniciales como se describe. - Agregar nuevos casos de uso según sea necesario.
- Identificar la Necesidad de OCP: - Analizar por qué el diseño actual puede ser problemático para la extensión. - Discutir cómo adherirse a OCP puede resolver el problema.
- Refactorizar el Código: - Modificar el diseño para garantizar que el sistema sea extensible. - Usar interfaces, herencia o composición según sea necesario.
- Probar el Código Refactorizado: - Asegurarse de que el código refactorizado funcione como se espera. - Verificar que las nuevas funcionalidades se integren sin modificar las clases existentes.

## Resultados Esperados

- Comprender la importancia de diseñar sistemas extensibles.
- Aprender a identificar y refactorizar violaciones de OCP.
- Escribir código más flexible y mantenible siguiendo OCP.

