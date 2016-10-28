package de.uni_leipzig.dbs.formRepository.api.form;

import java.util.Date;
import java.util.List;
import java.util.Set;

import de.uni_leipzig.dbs.formRepository.dataModel.EntitySet;
import de.uni_leipzig.dbs.formRepository.dataModel.EntityStructureVersion;
import de.uni_leipzig.dbs.formRepository.dataModel.GenericProperty;
import de.uni_leipzig.dbs.formRepository.dataModel.VersionMetadata;
import de.uni_leipzig.dbs.formRepository.dataModel.importer.ImportEntity;
import de.uni_leipzig.dbs.formRepository.exception.StructureBuildException;
import de.uni_leipzig.dbs.formRepository.exception.VersionNotExistsException;

/**
 * access to EntityStructureVersions
 * @author christen
 *
 */

public interface EntityStructureAPI {

	

	/**
	 * get Entity Structure Version
	 * @param name
	 * @param type
	 * @param date
	 * @return
	 * @throws VersionNotExistsException
	 * @throws StructureBuildException
	 */
	public EntityStructureVersion getEntityStructureVersion (String name, String type, String date) throws VersionNotExistsException, StructureBuildException;
	
	/**
	 * get all sources with the specified type
	 * @param type
	 * @return
	 * @throws StructureBuildException
	 */
	public Set<EntityStructureVersion> getEntityStructureVersionsByType (Set<String> type) throws StructureBuildException;
	
	
	/**
	 * latest structure
	 * @param name
	 * @param type
	 * @return
	 */
	public EntityStructureVersion getLatestStructureVersion (String name, String type);
	
	/**
	 * get a VersionMetdata object if the specified version exists
	 * @param name
	 * @param type
	 * @param version
	 * @return
	 * @throws VersionNotExistsException
	 */
	public VersionMetadata getMetadata(String name, String type, String version)throws VersionNotExistsException;
	
	/**
	 * get available properties for a specified source
	 * @param name
	 * @param from
	 * @param type
	 * @return
	 */
	public Set<GenericProperty> getAvailableProperties (String name, String from, String type);
	
}