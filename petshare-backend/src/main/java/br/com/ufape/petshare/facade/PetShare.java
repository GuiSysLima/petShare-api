package br.com.ufape.petshare.facade;

import br.com.ufape.petshare.model.User;
import br.com.ufape.petshare.services.UserServiceInterface;
import br.com.ufape.petshare.model.Animal;
import br.com.ufape.petshare.services.AnimalServiceInterface;
import br.com.ufape.petshare.model.Item;
import br.com.ufape.petshare.services.ItemServiceInterface;
import br.com.ufape.petshare.model.TypeItem;
import br.com.ufape.petshare.services.TypeItemServiceInterface;
import br.com.ufape.petshare.model.Post;
import br.com.ufape.petshare.services.PostServiceInterface;
import br.com.ufape.petshare.model.DonateAnimal;
import br.com.ufape.petshare.services.DonateAnimalServiceInterface;
import br.com.ufape.petshare.model.AdoptionAnimal;
import br.com.ufape.petshare.services.AdoptionAnimalServiceInterface;
import br.com.ufape.petshare.model.DonateItem;
import br.com.ufape.petshare.services.DonateItemServiceInterface;
import br.com.ufape.petshare.model.Request;
import br.com.ufape.petshare.services.RequestServiceInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PetShare {

	@Autowired
	private UserServiceInterface userService;
	@Autowired
	private AnimalServiceInterface animalService;
	@Autowired
	private ItemServiceInterface itemService;
	@Autowired
	private TypeItemServiceInterface typeitemService;
	@Autowired
	private PostServiceInterface postService;
	@Autowired
	private DonateAnimalServiceInterface donateanimalService;
	@Autowired
	private AdoptionAnimalServiceInterface adoptionanimalService;
	@Autowired
	private DonateItemServiceInterface donateitemService;
	@Autowired
	private RequestServiceInterface requestService;

	/* USER METHODS */
	public User saveUser(User user) {
		return userService.saveUser(user);
	}

	public User findUserById(Long id) {
		return userService.findUserById(id);
	}

	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	public User updateUser(Long id, User userDetails) {
		return userService.updateUser(id, userDetails);
	}

	public void deleteUser(Long id) {
		userService.deleteUser(id);
	}

	public Page<User> findUserPage(PageRequest pageRequest) {
		return userService.findUserPage(pageRequest);
	} /* ANIMAL METHODS */

	public Animal saveAnimal(Animal animal) {
		return animalService.saveAnimal(animal);
	}

	public Animal findAnimalById(Long id) {
		return animalService.findAnimalById(id);
	}

	public List<Animal> getAllAnimals() {
		return animalService.getAllAnimals();
	}

	public Animal updateAnimal(Long id, Animal animalDetails) {
		return animalService.updateAnimal(id, animalDetails);
	}

	public void deleteAnimal(Long id) {
		animalService.deleteAnimal(id);
	}

	public Page<Animal> findAnimalPage(PageRequest pageRequest) {
		return animalService.findAnimalPage(pageRequest);
	} /* ITEM METHODS */

	public Item saveItem(Item item) {
		return itemService.saveItem(item);
	}

	public Item findItemById(Long id) {
		return itemService.findItemById(id);
	}

	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}

	public Item updateItem(Long id, Item itemDetails) {
		return itemService.updateItem(id, itemDetails);
	}

	public void deleteItem(Long id) {
		itemService.deleteItem(id);
	}

	public Page<Item> findItemPage(PageRequest pageRequest) {
		return itemService.findItemPage(pageRequest);
	} /* TYPEITEM METHODS */

	public TypeItem saveTypeItem(TypeItem typeitem) {
		return typeitemService.saveTypeItem(typeitem);
	}

	public TypeItem findTypeItemById(Long id) {
		return typeitemService.findTypeItemById(id);
	}

	public List<TypeItem> getAllTypeItems() {
		return typeitemService.getAllTypeItems();
	}

	public TypeItem updateTypeItem(Long id, TypeItem typeitemDetails) {
		return typeitemService.updateTypeItem(id, typeitemDetails);
	}

	public void deleteTypeItem(Long id) {
		typeitemService.deleteTypeItem(id);
	}

	public Page<TypeItem> findTypeItemPage(PageRequest pageRequest) {
		return typeitemService.findTypeItemPage(pageRequest);
	} /* POST METHODS */

	public Post savePost(Post post) {
		return postService.savePost(post);
	}

	public Post findPostById(Long id) {
		return postService.findPostById(id);
	}

	public List<Post> getAllPosts() {
		return postService.getAllPosts();
	}

	public Post updatePost(Long id, Post postDetails) {
		return postService.updatePost(id, postDetails);
	}

	public void deletePost(Long id) {
		postService.deletePost(id);
	}

	public Page<Post> findPostPage(PageRequest pageRequest) {
		return postService.findPostPage(pageRequest);
	} /* DONATEANIMAL METHODS */

	public DonateAnimal saveDonateAnimal(DonateAnimal donateanimal) {
		return donateanimalService.saveDonateAnimal(donateanimal);
	}

	public DonateAnimal findDonateAnimalById(Long id) {
		return donateanimalService.findDonateAnimalById(id);
	}

	public List<DonateAnimal> getAllDonateAnimals() {
		return donateanimalService.getAllDonateAnimals();
	}

	public DonateAnimal updateDonateAnimal(Long id, DonateAnimal donateanimalDetails) {
		return donateanimalService.updateDonateAnimal(id, donateanimalDetails);
	}

	public void deleteDonateAnimal(Long id) {
		donateanimalService.deleteDonateAnimal(id);
	}

	public Page<DonateAnimal> findDonateAnimalPage(PageRequest pageRequest) {
		return donateanimalService.findDonateAnimalPage(pageRequest);
	} /* ADOPTIONANIMAL METHODS */

	public AdoptionAnimal saveAdoptionAnimal(AdoptionAnimal adoptionanimal) {
		return adoptionanimalService.saveAdoptionAnimal(adoptionanimal);
	}

	public AdoptionAnimal findAdoptionAnimalById(Long id) {
		return adoptionanimalService.findAdoptionAnimalById(id);
	}

	public List<AdoptionAnimal> getAllAdoptionAnimals() {
		return adoptionanimalService.getAllAdoptionAnimals();
	}

	public AdoptionAnimal updateAdoptionAnimal(Long id, AdoptionAnimal adoptionanimalDetails) {
		return adoptionanimalService.updateAdoptionAnimal(id, adoptionanimalDetails);
	}

	public void deleteAdoptionAnimal(Long id) {
		adoptionanimalService.deleteAdoptionAnimal(id);
	}

	public Page<AdoptionAnimal> findAdoptionAnimalPage(PageRequest pageRequest) {
		return adoptionanimalService.findAdoptionAnimalPage(pageRequest);
	} /* DONATEITEM METHODS */

	public DonateItem saveDonateItem(DonateItem donateitem) {
		return donateitemService.saveDonateItem(donateitem);
	}

	public DonateItem findDonateItemById(Long id) {
		return donateitemService.findDonateItemById(id);
	}

	public List<DonateItem> getAllDonateItems() {
		return donateitemService.getAllDonateItems();
	}

	public DonateItem updateDonateItem(Long id, DonateItem donateitemDetails) {
		return donateitemService.updateDonateItem(id, donateitemDetails);
	}

	public void deleteDonateItem(Long id) {
		donateitemService.deleteDonateItem(id);
	}

	public Page<DonateItem> findDonateItemPage(PageRequest pageRequest) {
		return donateitemService.findDonateItemPage(pageRequest);
	} /* REQUEST METHODS */

	public Request saveRequest(Request request) {
		return requestService.saveRequest(request);
	}

	public Request findRequestById(Long id) {
		return requestService.findRequestById(id);
	}

	public List<Request> getAllRequests() {
		return requestService.getAllRequests();
	}

	public Request updateRequest(Long id, Request requestDetails) {
		return requestService.updateRequest(id, requestDetails);
	}

	public void deleteRequest(Long id) {
		requestService.deleteRequest(id);
	}

	public Page<Request> findRequestPage(PageRequest pageRequest) {
		return requestService.findRequestPage(pageRequest);
	}
}
