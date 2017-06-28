package tw.com.softleader.sample.sports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import tw.com.softleader.sample.commons.GenericService;

public class SportsService implements GenericService<Sport> {

	private List<Sport> sports = new ArrayList<Sport>();

	@Override
	public Sport getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Sport> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Sport entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Sport entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
