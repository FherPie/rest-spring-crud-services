package com.module.dental.denti.pacient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.dental.denti.pacient.responses.ResponseGenerico;
import com.module.dental.denti.pacient.services.PacientService;
import com.module.dental.denti.pacient.utils.ControllersUtils;
import com.module.dental.pacient.models.PacientDto;

@CrossOrigin("*")
@RestController
@RequestMapping("private/")
public class PacientRest {

    @Autowired
    private PacientService pacientService;

    
    /**
     * REST to save PacientDto     *
     * @return savePacient
     */
    @PostMapping(value = "/savePacient")
    public ResponseEntity<?> savePacient(@RequestBody PacientDto obj) throws Exception {
        ResponseGenerico<PacientDto> response = new ResponseGenerico<>();
        try {
            PacientDto dto = pacientService.saveP(obj);
            return ControllersUtils.repuestaGenericoExitoObject(response, dto);
        } catch (Exception e) {
            return ControllersUtils.repuestaGenericoError(e, response);
        }
    }


    /**
     * REST to get List of PacientDto     *
     * @return savePacient
     */
    @GetMapping(value = "/listPacient")
    public ResponseEntity<?> listPacient() throws Exception {
        ResponseGenerico<PacientDto> response = new ResponseGenerico<>();
        try {
            List<PacientDto> list = pacientService.findAll();
            return ControllersUtils.repuestaGenericoExitoList(response, list);
        } catch (Exception e) {
            return ControllersUtils.repuestaGenericoError(e, response);
        }
    }

    /**
     * REST to get PacientDto     *
     * @return savePacient
     */
    @GetMapping(value = "/getByIdPacient/{id}")
    public ResponseEntity<?> getByIdPacient(@PathVariable Integer id) throws Exception {
        ResponseGenerico<PacientDto> response = new ResponseGenerico<>();
        try {
            PacientDto pacientDto = pacientService.getByIdPacient(id);
            return ControllersUtils.repuestaGenericoExitoObject(response, pacientDto);
        } catch (Exception e) {
            return ControllersUtils.repuestaGenericoError(e, response);
        }
    }

   /**
     * REST to update PacientDto     *
     * @return savePacient
     */
    @PutMapping(value = "/updatePacient")
    public ResponseEntity<?> updatePacient(@RequestBody PacientDto obj) throws Exception {
        ResponseGenerico<PacientDto> response = new ResponseGenerico<>();
        try {
            PacientDto dto = pacientService.saveP(obj);
            return ControllersUtils.repuestaGenericoExitoObject(response, dto);
        } catch (Exception e) {
            return ControllersUtils.repuestaGenericoError(e, response);
        }
    }


    /**
     * REST to delete  PacientDto     *
     * @return savePacient
     */
    @DeleteMapping(value = "/deletePacient/{id}")
    public ResponseEntity<?> deletePacient(@PathVariable Integer id) throws Exception {
        ResponseGenerico<PacientDto> response = new ResponseGenerico<>();
        try {
             pacientService.deleteP(id);
            return ControllersUtils.repuestaGenericoExitoObjectEliminacion(response);
        } catch (Exception e) {
            return ControllersUtils.repuestaGenericoError(e, response);
        }
    }

}
