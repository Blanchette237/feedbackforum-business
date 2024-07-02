package com.cmr.dev.feedbackforum.business.service;

import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
  

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
 

public interface IAbstractFeedbackforumService<Entity, BasicDTO, FullDTO extends BasicDTO, IEntityDAO extends JpaRepository<Entity, Integer>> {

	/**
	 * Create an new entity
	 * 
	 * @param ent : POJO to create
	 * @return
	 * @throws FeedbackforumBusinessException
	 */
	public FullDTO create(FullDTO ent) throws FeedbackforumBusinessException;

	/**
	 * Update an entity
	 * 
	 * @param entToUpdate
	 * @throws FeedbackforumBusinessException,AccessDeniedException
	 */
	public FullDTO update(FullDTO entToUpdate) throws FeedbackforumBusinessException, AccessDeniedException;

	/**
	 * Delete an entity
	 * 
	 * @param id : Entity'Id to delete
	 * @throws FeedbackforumBusinessException
	 * @throws AccessDeniedException
	 */
	public void deleteById(int id) throws FeedbackforumBusinessException, AccessDeniedException;

	/**
	 * Find All Entity
	 * 
	 * @return
	 */
	public List<BasicDTO> findAll();

	/**
	 * Found Entity By Id
	 * 
	 * @param id : Entity's Id to found
	 * @return
	 * @throws FeedbackforumBusinessException
	 */
	public FullDTO findById(int id) throws FeedbackforumBusinessException;

	/**
	 * Teste l'existence d'une Entité par son id
	 * 
	 * @param id
	 * @return
	 * @throws IndyliBusinessException
	 */
	public boolean ifEntityExistById(int id) throws FeedbackforumBusinessException;

	/**
	 * Recupere un DTO par son id
	 */
	public <T extends BasicDTO> T findById(int id, Class<T> type) throws FeedbackforumBusinessException;

	/**
	 * Retourne la reference du DAO en cours
	 * 
	 * @return
	 */
	public IEntityDAO getDAO();

	 

}
