//package br.github.cauzy.medicamento.utility;
//
//import br.github.cauzy.medicamento.controller.LaboratorioMB;
//import jakarta.faces.component.UIComponent;
//import jakarta.faces.context.FacesContext;
//import jakarta.faces.convert.Converter;
//import jakarta.faces.convert.FacesConverter;
//import br.github.cauzy.medicamento.entity.Laboratorio;
//
//import java.util.List;
//
//@FacesConverter(value = "laboratorioConverter")
//public class LaboratorioConverter implements Converter<Laboratorio> {
//
//    @jakarta.inject.Inject
//    private LaboratorioMB laboratorioMB;
//
//    @Override
//    public String getAsString(FacesContext context, UIComponent component, Laboratorio laboratorio) {
//        return (laboratorio != null) ? String.valueOf(laboratorio.getId()) : null;
//    }
//
//    @Override
//    public Laboratorio getAsObject(FacesContext context, UIComponent component, String value) {
//        if (value == null || value.trim().isEmpty()) {
//            return null;
//        }
//        List<Laboratorio> laboratorios = laboratorioMB.getLaboratorios();
//        return laboratorios.stream()
//                .filter(lab -> lab.getId().equals(Long.valueOf(value)))
//                .findFirst()
//                .orElse(null);
//    }
//}
