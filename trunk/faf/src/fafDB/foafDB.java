package fafDB;
import com.hp.hpl.jena.ontology.*;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.tdb.base.file.Location;


public class foafDB {
	Model schemaModel,modelTmp,modelData;
	OntModel scheme,ontModel;
	Location location;
	Dataset dataset;

	/*
	 * create model represent foaf ontoloy
	 */
	public void createSchemeModel(){
		scheme = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		ModelMaker modelMaker = ModelFactory.createFileModelMaker("C:/Users/Tien/AdroidExample/faf/res/ont/foaf.rdf");
		modelTmp = modelMaker.createDefaultModel();
		scheme = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM,modelTmp);
	}
	/*
	 * load foaf ontology and store in tdb
	 */
	public void loadOnt(){
		
		location = new Location("C:/Users/Tien/AdroidExample/faf/res/tdb");
		dataset = TDBFactory.createDataset(location);
		
		modelData = dataset.getDefaultModel();
		ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM,modelData);
		
		}
	
	public static void main(String args[]){
		new foafDB().createSchemeModel();
	}
	}
